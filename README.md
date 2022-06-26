# OneNight "Board" Game

**One Night | Ultimate Werewolf** is a beloved 4-10 player card game with a fatal flaw. 

If you are unfamiliar with the game:

* https://beziergames.com/products/one-night-ultimate-werewolf
* https://cdn.shopify.com/s/files/1/0740/4855/files/ONUW_rules-updated_for_BGG.pdf?337

The integrity of the game depends on the fact that the backs of every card are identical. <br>
Once any card has a slightly bent corner or a little stain, the mystery is compromised. <br>

This project allows each player to connect to a Spring server through nearly any browser, <br>
on nearly any type of device (so long as all devices are connected under the same modem). <br>
The WebSockets API allows each browser to participate in a two-way communication session <br>
(as opposed to constantly refreshing the page on the browser end) <br>

Having each player access the server from a browser means nobody needs to download any apps <br>
and nobody can tamper with the backs of cards for arbitrary clues as to who is the Werewolf. <br>
Additionally, you can easily create new characters and rules as you wish!

Major thanks to: 

* https://github.com/spring-guides/tut-spring-boot-kotlin
  * Spring Guides
* https://github.com/spring-guides/gs-messaging-stomp-websocket
  * Spring Guides 
* https://github.com/codemwnci/kotlin-springboot-websocket
  * codemwnci
* https://github.com/spring-tips/controllers
  * Spring Tips / joshlong
* https://www.youtube.com/watch?v=m0K3ElazGE0
  * Spring Tips / joshlong

Additional Resources:

* https://docs.spring.io/spring/docs/current/spring-framework-reference/languages.html#kotlin
* https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-kotlin.html
* https://codemwnci.medium.com/kotlin-springboot-and-websockets-276029b22482