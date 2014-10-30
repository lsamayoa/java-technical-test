# Java Technical Test

## Technical Test to acomplish

Write a function that takes an array of integers and returns that array rotated by N positions.
For example, if N=2, given the input array [1, 2, 3, 4, 5, 6] the function should return [5, 6, 1, 2, 3, 4];

## Project Requirements

In order to run this project you need to have a java [JDK](http://docs.oracle.com/javase/7/docs/webnotes/install/) 1.8 or newer installed and configured.
You will also need [maven](http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) installed and confiured.

## How to test

Clone this repo then `cd` into the project's directory and run `mvn test`.

## NumberArrayUtils

This class implements the technical test's answer. It implements it in the `rotate(int[],int)` method.

## Generate docs

The implementation classes contain Javadocs `cd` into the cloned repo and run `mvn javadoc:javadoc` to generate javadoc.