all = main
cc = g++
lib = -lpthread
flag = -Wall

src = ${wildcard *.cpp}
object = ${patsubst %.cpp, %.o, $(src)}

$(all) : $(object)
	$(cc) $(flag) $^ -o $@ $(lib)

.PHONY:clean
clean:
	-rm -rf $(all) $(object)