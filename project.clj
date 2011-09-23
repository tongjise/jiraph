(defproject jiraph "0.7.0-beta3"
  :description "embedded graph db library for clojure"
  :dependencies [[clojure "1.2.0"]
                 [useful "0.7.0-beta4"]
                 [masai "0.5.3"]
                 [cereal "0.1.5"]
                 [retro "0.6.0-alpha1"]
                 [ego "0.1.5"]]
  :dev-dependencies [[protobuf "0.5.0-alpha4"]
                     ;; [org.clojars.flatland/cake-marginalia "0.6.3"]
                     [tokyocabinet "1.24.1-SNAPSHOT" :ext true]]
  ;; :tasks [protobuf.tasks cake-marginalia.tasks]
  :cake-plugins [[cake-protobuf "0.5.0-alpha5"]])
