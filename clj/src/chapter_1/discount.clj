(ns chapter_1.discount)

(def prices [10 30 17 20 15 18 45 12])

(defn discount [over dscnt]
  (reduce + 0 (map #(* dscnt %) (filter #(> % over) prices))))

(defn discountTL [over dscnt]
  (->> prices
       (filter #(> % over))
       (map #(* dscnt %))
       (reduce + 0)))
