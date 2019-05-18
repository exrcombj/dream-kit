# dream-kit

<div align="center">
    <a href="https://travis-ci.org/">
        <img src="https://travis-ci.com/images/logos/Tessa-pride-4.svg" width="175">
    </a>
</div>
<br />
<div align="center">

[![Build Status](https://travis-ci.org/exrcombj/dream-kit.svg?branch=master)](https://travis-ci.org/exrcombj/dream-kit)

</div>

## desc
it's java utils tool lib

## bootstrap project
```bash

#!/usr/bin/env bash
mvn archetype:generate -DgroupId=com.exrcom.dream.kit -DartifactId=dream-kit -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## travis ci

https://travis-ci.org/exrcombj/dream-kit

## deploy to maven repo
```bash
mvn clean deploy
// this only use for exrcom dev
```

## jacoco plugin, maven ut test coverage report
add jacoco-maven-plugin

```
mvn test clean
# find ut test coverage report in ./target/site/jacoco/index.html
```

