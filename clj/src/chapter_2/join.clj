(ns chapter_2.join)

(defn print [names]
  (println (clojure.string/join ", " names)))
