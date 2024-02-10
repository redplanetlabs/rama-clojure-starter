(defproject com.rpl/rama-clojure-starter "1.0.0-SNAPSHOT"
  :dependencies [[com.rpl/rama-helpers "0.9.3"]]
  :repositories [["releases" {:id "maven-releases"
                              :url "https://nexus.redplanetlabs.com/repository/maven-public-releases"}]]

  :profiles {:dev {:resource-paths ["test/resources/"]}
             :provided {:dependencies [[com.rpl/rama "0.11.9"]]}}
  )
