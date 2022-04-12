#Makefile to compile and execute programs in c++ with g++
# (c) Wilson Javier Almario R. <wjalmarior@unal.edu.co>



help:
	@echo "Information about g++: "
	@echo "make gpp"
	@echo "        "
	@echo "Compile: "
	@echo "make all"
	@echo "        "
	@echo "Execute "	
	@echo "make main"
	@echo "        "	
	@echo "Delete all generated files"
	@echo "make clean"

gpp:
	@whereis g++
	@which g++
	@g++ --version

main:
	@./criba_out
	

all:
	@g++ criba.cpp eratostenes.cpp -o criba_out -lm
	@echo "Done"

clean:
	@rm -rf main_out
	@echo "Done"