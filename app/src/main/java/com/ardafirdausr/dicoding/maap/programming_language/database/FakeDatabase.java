package com.ardafirdausr.dicoding.maap.programming_language.database;

import com.ardafirdausr.dicoding.maap.programming_language.model.ProgrammingLanguage;

import java.util.ArrayList;

public class FakeDatabase {

    private static Object[][] fakeData = new Object[][]{
            { 1, "Python", 28.73f,  "https://www.stickpng.com/assets/images/5848152fcef1014c0b5e4967.png", "Python is a general-purpose interpreted, interactive, object-oriented, and high-level programming language. It was created by Guido van Rossum during 1985- 1990. Like Perl, Python source code is also available under the GNU General Public License (GPL)."},
            { 2, "Java", 20.0f,  "http://www.sclance.com/pngs/java-png/java_png_728079.png", "Java is a high-level programming language originally developed by Sun Microsystems and released in 1995. Java runs on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX."},
            { 3, "Javascript", 8.35f,  "http://pluspng.com/img-png/logo-javascript-png-html-code-allows-to-embed-javascript-logo-in-your-website-587.png", "JavaScript is a lightweight, interpreted programming language. It is designed for creating network-centric applications. It is complimentary to and integrated with Java. JavaScript is very easy to implement because it is integrated with HTML. It is open and cross-platform."},
            { 4, "C#", 7.43f, "https://assets.exercism.io/tracks/csharp-bordered-turquoise.png", "C# is a simple, modern, general-purpose, object-oriented programming language developed by Microsoft within its .NET initiative led by Anders Hejlsberg." },
            { 5, "PHP", 6.83f, "http://www.pngmart.com/files/7/PHP-PNG-File.png", "The PHP Hypertext Preprocessor (PHP) is a programming language that allows web developers to create dynamic content that interacts with databases. PHP is basically used for developing web based software applications."},
            { 6, "C++", 5.87f, "https://freepngimg.com/thumb/c++/2-2-c++-png-clipart.png", "C++ is a middle-level programming language developed by Bjarne Stroustrup starting in 1979 at Bell Labs. C++ runs on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX." },
            { 7, "R", 3.92f, "https://workingnation.com/wp-content/uploads/2018/05/R_logo.svg_.png", "R is a programming language and software environment for statistical analysis, graphics representation and reporting. R was created by Ross Ihaka and Robert Gentleman at the University of Auckland, New Zealand, and is currently developed by the R Development Core Team." },
            { 8, "Objective-C", 2.7f, "https://camo.githubusercontent.com/b34dc073236fc468685258c796d7b96220f271f9/687474703a2f2f7777772e696f732d626c6f672e636f2e756b2f77702d636f6e74656e742f75706c6f6164732f323031362f30312f6f626a6563746976652d632d7475746f7269616c732e706e67", "Objective-C is a general-purpose, object-oriented programming language that adds Smalltalk-style messaging to the C programming language. This is the main programming language used by Apple for the OS X and iOS operating systems and their respective APIs, Cocoa and Cocoa Touch." },
            { 9, "Swift", 2.41f, "http://img.deusm.com/informationweek/2015/09/1322066/Swift_logo.png", "Swift 4 is a new programming language developed by Apple Inc for iOS and OS X development. Swift 4 adopts the best of C and Objective-C, without the constraints of C compatibility. Swift 4 uses the same runtime as the existing Obj-C system on Mac OS and iOS, which enables Swift 4 programs to run on many existing iOS 6 and OS X 10.8 platforms." },
            { 10, "Ruby", 1.44f, "https://cdn.tutsplus.com/net/uploads/legacy/417_ruby/images/ruby.png", "Ruby is a scripting language designed by Yukihiro Matsumoto, also known as Matz. It runs on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX." },
            { 11, "Kotlin", 1.43f, "https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Kotlin-logo.svg/1024px-Kotlin-logo.svg.png", "Kotlin is a programming language introduced by JetBrains, the official designer of the most intelligent Java IDE, named Intellij IDEA. This is a strongly statically typed language that runs on JVM. In 2017, Google announced Kotlin is an official language for android development. Kotlin is an open source programming language that combines object-oriented programming and functional features into a unique platform." },
            { 12, "GO", 1.21f, "https://sdtimes.com/wp-content/uploads/2018/02/golang.sh_-490x490.png", "Go language is a programming language initially developed at Google in the year 2007 by Robert Griesemer, Rob Pike, and Ken Thompson. It is a statically-typed language having syntax similar to that of C. It provides garbage collection, type safety, dynamic-typing capability, many advanced built-in types such as variable length arrays and key-value maps. It also provides a rich standard library. The Go programming language was launched in November 2009 and is used in some of the Google's production systems." },
            { 13, "Scala", 1.15f, "http://assets.stickpng.com/thumbs/58482f45cef1014c0b5e4a7e.png", "Scala is a modern multi-paradigm programming language designed to express common programming patterns in a concise, elegant, and type-safe way. Scala has been created by Martin Odersky and he released the first version in 2003. Scala smoothly integrates the features of object-oriented and functional languages." },
            { 14, "Rust", 0.63f, "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Rust_programming_language_black_logo.svg/1024px-Rust_programming_language_black_logo.svg.png", "Rust is a modern systems programming language developed by the Mozilla Corporation. It is intended to be a language for highly concurrent and highly secure systems. It compiles to native code; hence, it is blazingly fast like C and C++." },
            { 15, "Lua", 0.37f, "https://education.ti.com/-/media/ti/education/images/products/product-details/hero/solutions-lua-scripting-hero.png?rev=86d6e171-6c23-4554-aa8b-ad4e7588c114&h=320&w=420&la=en-AU&hash=5C7B0B42E6EFB0048771F75BD60AA87F3FA190F1", "Lua is an open source language built on top of C programming language. Lua has its value across multiple platforms ranging from large server systems to small mobile applications. This tutorial covers various topics ranging from the basics of Lua to its scope in various applications." }
    };

    public static ArrayList<ProgrammingLanguage> getListData(){
        ArrayList<ProgrammingLanguage> list = new ArrayList<>();
        for (Object[] datum: fakeData) {
            ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
            programmingLanguage.setId((int) datum[0]);
            programmingLanguage.setName((String) datum[1]);
            programmingLanguage.setShareRate((float) datum[2]);
            programmingLanguage.setImage((String) datum[3]);
            programmingLanguage.setDescription((String) datum[4]);
            list.add(programmingLanguage);
        }
        return list;
    }
}
