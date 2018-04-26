#!/bin/sh

TESTEE="src/main/scala/testee03.scala"
TESTER="src/test/resources/dna_test.scala"
SRC="src/main/resources/dna.scala"

mkdir -p src/main/scala
mkdir -p src/test/scala
rm -f $TESTEE >& /dev/null
rm -rf src/test/scala/*
rm -rf src/main/scala/*
cp $TESTER src/test/scala/
echo "package gairon.k08.k02" >> $TESTEE
echo "object Main{" >> $TESTEE
sed -e 's!^:paste!!g' $SRC >> $TESTEE
echo "}" >> $TESTEE
sbt test
