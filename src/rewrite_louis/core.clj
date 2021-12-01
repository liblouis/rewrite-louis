(ns rewrite-louis.core
  (:gen-class)
  (:require [clojure.java.io :as io]
            [instaparse.core :as insta]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [parser (insta/parser (io/resource "louis.bnf"))]
    (doseq [f args]
      (let [result (->> f slurp (insta/parse parser))]
        (if (insta/failure? result)
          (println f result)
          (println f "OK"))))))
