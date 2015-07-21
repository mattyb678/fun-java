(ns chapter_2.transform
  (:require [clojure.string :as str]))

(defn transform [names]
  (map str/upper-case names))
