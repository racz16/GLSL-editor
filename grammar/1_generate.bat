del /f /s /q generated_source 1>nul
rmdir /s /q generated_source
mkdir generated_source

antlr4 -o generated_source -package hu.racz.zalan.editor.antlr.generated GLSL.g4