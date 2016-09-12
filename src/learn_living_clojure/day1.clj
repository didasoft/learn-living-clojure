(ns learn-living-clojure.day1)

(= 3 4)

(map #(%1 %2) (cycle [inc identity]) [1 2 3 4 5 6])

(if
  (condition)
  (do-something)
  (do-something-else
    (let [my-var (test)] (((()))))))