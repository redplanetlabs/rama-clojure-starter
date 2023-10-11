(ns rama-clojure-starter.core-test
  (:use [clojure.test]
        [com.rpl.rama]
        [com.rpl.rama.path])
  (:require [com.rpl.rama.aggs :as aggs]
            [com.rpl.rama.ops :as ops]
            [com.rpl.rama.test :as rtest]
            [rama-clojure-starter.my-module :as mm]))

(deftest module-test
  (with-open [ipc (rtest/create-ipc)]
    (rtest/launch-module! ipc mm/MyModule {:tasks 4 :threads 2})

    ))
