(set-env!
 :dependencies '[[adzerk/boot-cljs          "1.7.228-1"]
                 [adzerk/boot-cljs-repl     "0.3.0"]
                 [com.cemerick/piggieback   "0.2.1"  :scope "test"]
                 [weasel                    "0.7.0"  :scope "test"]
                 [org.clojure/tools.nrepl   "0.2.12" :scope "test"]
                 [adzerk/boot-reload        "0.4.2"]
                 [hoplon/boot-hoplon        "0.1.13"]
                 [hoplon/hoplon             "6.0.0-alpha11"]
                 [hoplon/twitter-bootstrap  "0.2.0"]
                 [org.clojure/clojure       "1.8.0"]
                 [org.clojure/clojurescript "1.7.228"]
                 [tailrecursion/boot-jetty  "0.1.0"]]
 :source-paths #{"src"}
 :asset-paths  #{"assets"})

(require
 '[adzerk.boot-cljs         :refer [cljs]]
 '[adzerk.boot-cljs-repl    :refer [cljs-repl start-repl]]
 '[adzerk.boot-reload       :refer [reload]]
 '[hoplon.boot-hoplon       :refer [hoplon prerender]]
 '[tailrecursion.boot-jetty :refer [serve]])

(deftask dev
  "Build clojure-tw for local development."
  []
  (comp
   (watch)
   (speak)
   (hoplon)
   (reload)
   (cljs-repl)
   (cljs)
   (serve :port 8000)))

(deftask prod
  "Build clojure-tw for production deployment."
  []
  (comp
   (hoplon)
   (cljs :optimizations :advanced)
   (prerender)))
