(ns webfui-examples.views.clocky
  (:require [webfui-examples.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.page :only [include-css include-js html5]]
        [hiccup.element :only [javascript-tag]]
        [hiccup.core :only [html]]))

(defpage "/clocky_should_be" []
         (common/layout "clocky"))

; sloppy cut and paste from common since this is not as common...
; (needed a 2nd javascript file)
(defpage "/clocky" []
  (let [name "clocky"]
    (html5
      [:head
       [:title "webfui-examples"]
       (include-css (str "/css/" name ".css"))
       (javascript-tag "var CLOSURE_NO_DEPS = true;")
       (include-js (str "/js/rAF.js"))
       (include-js (str "/js/" name ".js"))]
      [:body])))
