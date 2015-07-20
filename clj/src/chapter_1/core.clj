(ns chapter_1.core
  (:require [chapter_1.cities :as cities]
            [chapter_1.discount :as discount]))

(defn main []
  (println "Found chicago?" (cities/find "Chicago"))
  (println "Found boise?" (cities/find "Boise"))
  (println "Total of discounted prices:" (discount/discount 20 0.9)))
