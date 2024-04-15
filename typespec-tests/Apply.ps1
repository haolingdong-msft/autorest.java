
Remove-Item ./tsp-output -Recurse -Force

tsp compile tsp/patch.tsp

Remove-Item -Path ./src/main/java/com/cadl/patch -Recurse -Force -ErrorAction SilentlyContinue

Copy-Item -Path ./tsp-output/src/main/java/com/cadl/patch -Destination ./src/main/java/com/cadl/ -Recurse -Force -Exclude @("ReadmeSamples.java", "module-info.java")
