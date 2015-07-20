(ns clj.core
  (:require [clj.cities :as cities]
            [clj.discount :as discount]))

(defn main []
  (println "Found chicago?" (cities/find "Chicago"))
  (println "Found boise?" (cities/find "Boise"))
  (println "Total of discounted prices:" (discount/discount 20 0.9)))
