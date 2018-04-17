del /f /s /q generated_source 1>nul
rmdir /s /q generated_source
mkdir generated_source

antlr4 -o generated_source GLSL.g4