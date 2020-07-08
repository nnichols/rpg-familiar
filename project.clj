(defproject rpg-familiar "0.1.0-SNAPSHOT"
  :description "RPG Utilities for DMs in need"
  :url "https://github.com/nnichols/rpg-familiar"
  :license {:name "MIT"
            :url  "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot rpg-familiar.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
