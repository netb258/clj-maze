(defproject maze "0.1.0-SNAPSHOT"
  :description "This program recursively traverses a maze and prints out all paths."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot maze.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
