(ns chapter_1.cities)

(def cities ["SLC" "Denver" "Chicago" "NYC" "Madrid" "London"])

(defn find [toFind]
  (if (some #(= toFind %) cities)
    true
    false))
