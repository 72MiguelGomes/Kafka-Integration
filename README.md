# Kafka Integration

## Requirements

### Install Kafka

https://kafka.apache.org/quickstart

##### Create a topic

```
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic users
```

##### Check if the topic exists:
```
bin/kafka-topics.sh --list --zookeeper localhost:2181
```


##### Listen Topic

```
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic users --from-beginning
```

##### Send Messages to Topic

```
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic users
```