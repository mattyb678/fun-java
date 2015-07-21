(ns chapter_2.iteration)

(defn iterate [names]
  (doseq [x names]
    (println x)))
