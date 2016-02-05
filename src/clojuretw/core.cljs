(ns clojuretw.core
  (:require [reagent.core :as r]
            [goog.crypt.base64 :as base64]))

(defn navigation []
  [:nav
   [:ul
    [:li [:a {:href "/"} "最新消息"]]
    [:li [:a {:href "/"} "學習資源"]]
    [:li [:a {:href "/"} "關於我們"]]]])

(defn header []
  [:header {:id "site-title"}
   [:h1
    [:a {:href "/"} "Clojure Taiwan"]]
   [navigation]])

(defn footer []
  [:footer
   [:a {:href "http://creativecommons.org/licenses/by-sa/4.0/deed.zh_TW"
        :class "license"} 
    [:img {:src "/images/cc-by-sa.svg"
           :alt "Creative Commons BY-SA 4.0"}]]
   [:div
    [:a {:href "https://github.com/clojure-tw/website"} "本站原始碼"]]])

(defn main []
  [:main])

(defn participation-child
  [{:keys [link color text]}]
  [:li
   [:a {:href link
        :style {:background (str "linear-gradient(#fff 1em, #fff calc(100% - 5px), " color " calc(100% - 5px))")}}
    [:div.info
     [:strong {:style {:color color}} text]]
]])

(defn section []
  [:section {:id "participation"}
   [:h2 "社群參與"]
   [:div.content
    [:ul.distro
     [participation-child {:link (base64/decodeString "aHR0cHM6Ly90ZWxlZ3JhbS5tZS9qb2luY2hhdC9CTjRKX0FLd25ndTVoQlBrUm81Z1l3Cg==")
                           :color "#1793D1"
                           :text "Telegram"}]
     [participation-child {:link "https:/www.facebook.com/groups/clojure.taiwan"
                           :color "#4870BC"
                           :text "Facebook"}]
     [participation-child {:link "https://twitter.com/clojuretw"
                           :color "#4870BC"
                           :text "Twitter"}]
     [participation-child {:link "http://www.meetup.com/Clojure-tw/"
                           :color "#DD4814"
                           :text "Meetup"}]]]])

(defn app []
  [:div
   [header]
   [main]
   [section]
   [footer]])

(defn ^:export run []
  (r/render [app]
            (js/document.getElementById "app")))
