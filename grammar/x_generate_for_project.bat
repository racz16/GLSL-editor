del /f /s /q generated_source_for_project 1>nul
rmdir /s /q generated_source_for_project 
mkdir generated_source_for_project 

antlr4 -o generated_source_for_project -package hu.racz.zalan.editor.antlr.generated GLSL.g4