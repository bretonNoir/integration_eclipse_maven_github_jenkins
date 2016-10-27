
@echo off

rem La solution de lancement suivante ne fonctionne pas car Maven n'a pas inséré dans le fichier Manifest.mf
rem l'attribut 'main' la caisse contenant le point d'entrée

rem cd target
rem java -jar 02_ProjetGithubMaven-0.0.1-SNAPSHOT

rem Solution: je lance l'application en précisant explicitement la classe qui contient le point d'entrée
rem je dois aussi informer la VM où se trouve la/les classe/S
rem je fais cela à l'aide de l'option -cp( ou -classpath) - chemin de drecherche des claasses
rem Dans mon cas, les classes se trouvent dans l'archive 02_ProjetGithub
java -cp target\02_ProjetGithubMaven-0.0.1-SNAPSHOT.jar com.mii.gitmaven.Main

pause