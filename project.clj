(defproject marginalia "dynamic-version"
  :description "lightweight literate programming for clojure -- inspired by [docco](http://jashkenas.github.com/docco/)"
  :repositories
    {"climate" "http://maven.ci.climatedna.net/nexus/service/local/repositories/climate/content"}
  :dependencies
  [[org.clojure/clojure "1.7.0"]
   [org.clojure/clojurescript "0.0-2138"]
   [org.clojure/tools.namespace "0.1.1"]
   [org.clojure/tools.cli "0.2.1"]
   [org.markdownj/markdownj "0.3.0-1.0.2b4"]
   [de.ubercode.clostache/clostache "1.3.1"]]

  :resource-paths ["vendor"]
  :plugins [[com.climate.plugins/tcc-base-project "2014.10.27T23.49.27.ac58238"]]

  ;;Needed for testing Latex equation formatting. You must download
  ;;and install MathJax in you doc directory.
  :marginalia {:javascript ["mathjax/MathJax.js"]})
