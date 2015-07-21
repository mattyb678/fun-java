(ns chapter_2.startsWith
  (:require [clojure.string :as str]))



(defn pick [letter names]
  (filter #(.startsWith % letter) names))

(defn pickOne [letter names]
  (let [n (first (pick letter names))]
    (if (nil? n)
      "No Name Found"
      n)))

