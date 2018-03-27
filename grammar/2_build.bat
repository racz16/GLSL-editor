del /f /s /q generated_code 1>nul
rmdir /s /q generated_code
mkdir generated_code

javac -d generated_code generated_source/*.java