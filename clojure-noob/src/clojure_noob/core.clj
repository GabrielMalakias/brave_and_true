(ns clojure-noob.core
  (:gen-class))

;; Testing functions
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Teste de teste"))

(defn who-i-love
  "Returns a loved person"
  ([name]
  (str "I love " name "so much"))
  ([person-loved your-name]
   (str "I, " your-name "loves " person-loved " so much!")))

;; Testing arities
(defn testing-arities
  "Returns functions some tests"
  ([]
   (str "Its only an empty string"))
  ([name]
   (str "my name is:" name))
  ([first second]
   (str (+ first second))))

(defn inc-numbers
  [number]
  (inc number))


(defn introduce-yourself
 "Returns a person and list of languages"
 [name & languages]
 (str "Hi, my name is " name " and i use this languages "
      (clojure.string/join ", " languages)))


;; Testing destructuring
(defn my-first
  "Returns a first value"
    [[first]] first)


;; Testing loops
(defn loop-into-vector
  " Testing loops"
  [some-vector]
  (loop [[first & last] some-vector]
    (if-not (nil? first)
    (do (println (* first 10))
    (recur last)))))
