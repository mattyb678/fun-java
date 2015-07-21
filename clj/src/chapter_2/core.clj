(ns chapter_2.core
  (:require [chapter_2.iteration :as iter]
            [chapter_2.transform :as trans]
            [chapter_2.startsWith :as sw]
            [chapter_2.longest :as longest]
            [chapter_2.join :as join]))

(def friends ["Brian" "Nate" "Neal" "Raju" "Sara" "Scott"])

(defn print-elems [elems]
  (doseq [x elems]
    (print x ""))
  (println))

(defn main []
  (println "---------- Iterate ----------")
  (iter/iterate friends)
  (println "---------- Transform ----------")
  (print-elems (trans/transform friends))
  (println "---------- Pick ----------")
  (print-elems (sw/pick "N" friends))
  (print-elems (sw/pick "B" friends))
  (println (count (sw/pick "N" friends)) "startsWith N")
  (println (count (sw/pick "B" friends)) "startsWith B")
  (println "---------- Pick One ----------")
  (println (sw/pickOne "N" friends))
  (println (sw/pickOne "Z" friends))
  (println "---------- Longest ----------")
  (println "Total chars in all names:" (longest/totalChars friends))
  (println "A longest name:" (longest/longest friends))
  (println "Longest name:" (longest/longest friends "Steve"))
  (println "---------- Join ----------")
  (join/print friends))


