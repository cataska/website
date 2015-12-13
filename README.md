# clojure-tw.github.io
[![Build Status](https://travis-ci.org/clojure-tw/website.svg?branch=master)](https://travis-ci.org/clojure-tw/website)
[![License](http://img.shields.io/badge/license-GPL-blue.svg?style=flat)](http://www.opensource.org/licenses/gpl-license.html)
[![waffle.io](https://badge.waffle.io/clojure-tw/website.png?label=ready&title=Ready)](http://waffle.io/clojure-tw/website)
[![Join the chat at telegram](https://img.shields.io/badge/telegram-join%20chat-2793D9.svg)](https://telegram.me/joinchat/BN4J_AKwngu5hBPkRo5gYw)


這是 http://clojure-tw.github.io 的網站，使用 [hoplon](http://hoplon.io) 來製作，
原始碼請見: https://github.com/clojure-tw/website

## TODO
 1. create basic landing page (via hoplon)
 2. Add irc/gitter/slack/twitter info
 3. Add planet.clojure-tw for RSS feed
 4. CLJ REPL ? http://www.tryclj.com/
 5. CLJS REPL ? http://clojurescript.net/

## TOOLS
 1. route: https://github.com/gf3/secretary
 2. css: https://github.com/noprompt/garden

## Channel
 1. IRC: freenode #clojure.tw
 2. slack: clojure-taiwan
 3. gitter: https://gitter.im/clojure-tw/clojure-tw
 4. TODO: add robot to sync all channel

## 理念
 1. 提供 Clojure 相關資訊給台灣想學 Clojure 的迷途羔羊們
 2. 不和 `營利` 扯上邊 (我們只想享受語言的樂趣、知識應該共享)

## 合作
 1. 共同寫 clojure/clojurescript Open Source 專案, ex: 結巴分詞的 clojure 版本
 2. 協作翻譯 clojure 相關開放資訊? (ex: modern-cljs)

## Dependencies

- java 1.7+
- [boot][1]

## Usage
### Development
1. Start the `dev` task. In a terminal run:
    ```bash
    $ boot dev
    ```
    This will give you a  Hoplon development setup with:
    - auto compilation on file changes
    - audible warning for compilation success or failures
    - auto reload the html page on changes
    - Clojurescript REPL

2. Go to [http://localhost:8000][2] in your browser. You should see "Hello, Hoplon!".

3. If you edit and save a file, the task will recompile the code and reload the
   browser to show the updated version.

### Production
1. Run the `prod` task. In a terminal run:
    ```bash
    $ boot prod
    ```

2. The compiled files will be on the `target/` directory. This will use
   advanced compilation and prerender the html.

## Other Community Site
 1. http://amsclj.nl/
 2. http://www.londonclojurians.org/
 3. http://beclojure.org/

## License

Copyright © 2015, **Clojure-Taiwan Community**
