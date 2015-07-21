(ns chapter_2.longest)

(defn totalChars [names]
  (reduce + (map #(count %) names)))

(defn longest
  ([names] (longest names nil))
  ([names base]
   (reduce #(if (>= (count %1) (count %2)) %1 %2) base names)))
