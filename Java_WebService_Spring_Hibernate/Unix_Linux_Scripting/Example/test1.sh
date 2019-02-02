#!/bin/bash

# To test where text variable exist or not
#Assign value of current date to text

if [ -z ${text+x} ]; then 
	echo Text is not set
	text=$(date +"%d-%m-%H")
fi


text1="Manish"
echo $text1
# -z  means the length of STRING is zero
if [ ! -z "$text1" ]; then
	echo "This is the value " $text1
fi

text2=""
# -n means the length of STRING is nonzero
if [ -n "$text2" ]; then
	echo "This is the value " $text2
fi

VBUILD="123"
# check VBUILD variable exist or not
if [ -z ${VBUILD+x} ]; then 
  VBUILD=""
fi;

# if VBUILD value is not set
if [ -z "$VBUILD" -o "$VBUILD" == " " ]; then
    VBUILD=$(date +"%d%M") > env.properties
    
    echo "##############################"
    echo "NEW VBUILD : $VBUILD "
    echo "##############################"
else 
	echo "VBUILD value : $VBUILD"
	VBUILD+="U"
	echo "VBUILD value after change : $VBUILD"
fi;
