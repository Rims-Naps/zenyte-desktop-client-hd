@echo off
title Pixies Cache
cd cache/target
"C:\Program Files\zulu\zulu-11\bin\java.exe" -cp target/cache-1.5.22.1-jar-with-dependencies.jar net.runelite.cache.MapImageDumper D:\zyrox\Zyrox-Server\data\cache
pause