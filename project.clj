(defproject jiraph "0.6.1-SNAPSHOT"
  :description "embedded graph db library for clojure"
  :dependencies [[clojure "1.2.0"]
                 [clojure-useful "0.3.8"]
                 [masai "0.5.1-SNAPSHOT"]
                 [retro "0.5.0"]
                 [cereal "0.1.0-SNAPSHOT"]
                 [tokyocabinet "1.24.1-SNAPSHOT"]]
  :dev-dependencies [[clojure-protobuf "0.4.0-SNAPSHOT"]]
  :tasks [protobuf.tasks])
