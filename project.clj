(defproject rewrite-louis "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [instaparse "1.4.10"]]
  :main ^:skip-aot rewrite-louis.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
