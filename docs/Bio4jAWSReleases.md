# Pre-built Bio4j releases in AWS

> This is the recommended way of using Bio4j-titan. For this you need a working Amazon Web Services (AWS) account.

We offer two pre-imported Bio4j-titan distributions:

| Modules included             | Bio4j-lite | Bio4j-full |
|:-----------------------------|:----------:|:----------:|
| UniProt (SwissProt + TrEMBL) |     ✓      |     ✓      |
| Gene Ontology (GO)           |     ✓      |     ✓      |
| NCBI taxonomy                |     ✓      |     ✓      |
| Enzyme DB                    |     ✓      |     ✓      |
| UniProtGO                    |     ✓      |     ✓      |
| UniProtEnzymeDB              |     ✓      |     ✓      |
| UniProtNCBITaxonomy          |     ✓      |     ✓      |
| UniProtInteractions          |     ✓      |     ✓      |
| UniProtIsoforms              |     ✓      |     ✓      |
| UniRef                       |            |     ✓      |
| UniProtUniRef                |            |     ✓      |
| GenInfo                      |            |     ✓      |
| NCBITaxonomyGenInfo          |            |     ✓      |
|                              |            |            |
| **Approximate size**         | 462.4 GiB  |  1.3 TiB   |


They are available as tar-archives from S3 through a [requester-pays](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html) bucket `s3://eu-west-1.releases.bio4j.com`, in the `eu-west-1` (Ireland) region. The S3-keys are

- **bio4j-lite**: `2014_12_03/bio4j_all_but_uniref_and_gi_index.tar`
- **bio4j-full**: `2014_12_03/bio4j_all_plus_isoforms.tar`


## Using Bio4j with your AWS account

#### IMPORTANT: AWS cost and fees

AWS charges fees for downloading S3 objects: [AWS S3 pricing - data transfer](https://aws.amazon.com/s3/pricing/#Data_Transfer_Pricing). However, this is free _if you download it from an EC2 instance within the same region_. Thus, you won't incur in any data transfer cost if you download Bio4j from an EC2 instance in the `eu-west-1` region. Your AWS costs would be in this case just those associated to the compute inrastructure: the EC2 instance/s and, if using them, EBS volumes.

**IMPORTANT:** If you download it from your local computer you will incur in sizable costs: around **$50** for bio4j-lite and **$120** for bio4j-full.

#### IAM user configuration

You need to grant permissions to the user/role which you will use to download the Bio4j distribution: read access to `s3://eu-west-1.releases.bio4j.com/` is enough. The following is an IAM policy which is more than sufficient for that:

```json
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Sid": "Stmt1434711865000",
            "Effect": "Allow",
            "Action": [
                "s3:GetObject"
            ],
            "Resource": [
                "arn:aws:s3:::eu-west-1.releases.bio4j.com",
                "arn:aws:s3:::eu-west-1.releases.bio4j.com/*"
            ]
        }
    ]
}
```


### Get Bio4j from an EC2 instance

The way this is expected to be used is:

1. Launch an EC2 instance in the `eu-west-1` region

    > **Note**, that you need to use either EBS volumes or an instance type with enough of ephemeral storage

2. Download the binary files for either bio4j-lite or bio4j-full. You can use aws-cli for that. For example:

    - for bio4j-lite:

        ```bash
        aws s3api get-object
          --region eu-west-1 \
          --request-payer requester \
          --bucket eu-west-1.releases.bio4j.com \
          --key 2014_12_03/bio4j_all_but_uniref_and_gi_index.tar \
          bio4j-lite.tar
        ```

    - for bio4j-full:

        ```bash
        aws s3api get-object
          --region eu-west-1 \
          --request-payer requester \
          --bucket eu-west-1.releases.bio4j.com \
          --key 2014_12_03/bio4j_all_plus_isoforms.tar \
          bio4j-full.tar
        ```

    Do note that you need to put there `--request-payer requester` literally, not your AWS ID, username or anything else.

3. Extract the downloaded archive:

    ```bash
    tar xvf bio4j-lite.tar
    ```

4. Enjoy! Now you should check [TitanDB documentation](http://s3.thinkaurelius.com/docs/titan/0.5.4/) to learn how to connect to the database and query it. Note, that these releases of Bio4j-titan were made using  Titan `v.0.5.4`.
