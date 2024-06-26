# ittf-scores

## Table Tennis Players Analysis Project (WIP)

### Overview

This project focuses on analyzing table tennis player data using Apache Spark, Scala, and SQL. The primary goal is to
perform insightful analysis on CSV files containing information about table tennis players.

### Technologies

- Apache Spark
- Scala

## **Running application**

Application is running locally with following installed dependencies:

- Apache Hadoop **v3.4.0**
- Apache Spark **v3.5.1**
- Scala **v2.12.18**
- sbt **v1.9.9**

To test application please go to root directory and run:

```
sbt test
```

To run application create jar with sbt assembly. Go to root directory and run:

```
sbt assembly
```

Run daemons required for the Hadoop Distributed File System (HDFS):

```
./hadoop/sbin/start-dfs.sh
```

Run YARN:

```
./hadoop/sbin/start-yarn.sh
```

Apply test files to HDFS:

```
./bin/hdfs dfs -put <path-to-project>/ittf-scores/data
```

Then run application in cluster mode using that jar:

```
${SPARK_HOME}/bin/spark-submit --class org.Main --master yarn --queue <dev or prod> path-to-project/ittf-scores/target/scala-2.12/ittf-scores-assembly-0.1.0-SNAPSHOT.jar 
```

After that shut down the processes:

```
./hadoop/stop-dfs.sh
./hadoop/stop-yarn.sh
```

## Features that will be presented

1. **Data Analysis:**

- Utilizes Spark, Scala, and SQL for in-depth analysis of table tennis player data.
- Performs various statistical and exploratory analyses on the provided CSV files.

2. **Logging:**

- Implements logging functionality to track and document events, errors, and other important information during the
  execution of the project.

3. **Metrics:**

- Incorporates metrics to measure and evaluate the performance of the analysis. This includes tracking execution times,
  resource usage, and other relevant metrics.
