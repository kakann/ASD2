all:
	find . -name "*.java" > sources.txt && javac -d classes @sources.txt
