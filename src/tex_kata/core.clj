(ns tex-kata.core
  (:require [clojure.string :as str]))

(def puzzle-input (str/split (slurp "resources/y18d02") #"\s+"))

(defn idcount-by-letter-dups [id-list duplications]
  (->> id-list
       (map frequencies)
       (map vals)
       (filter (partial some #{duplications}))
       (count)))

(apply * (map (partial idcount-by-letter-dups puzzle-input) [2 3]))