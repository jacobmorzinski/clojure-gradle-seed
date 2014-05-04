(ns example
  (:gen-class))

(defn -main
  [& args]
  (println "Hello, World!  Here's the commandline args we were given:")
;; The backquote (`) and splice operator (~@) turn the list
;; into its separate elements.
;  (println `(prn ~@args))
  (eval `(prn ~@args)))
