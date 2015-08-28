<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Song View</title>
    <spring:url value="/resources/core/css/main.css" var="coreCss"/>
    <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss"/>
    <spring:url value="/resources/core/js/main.js" var="coreJs"/>
    <spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapJs"/>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${coreJs}"></script>
    <script src="${bootstrapJs}"></script>
    <link href="${bootstrapCss}" rel="stylesheet"/>
    <link href="${coreCss}" rel="stylesheet"/>
</head>


<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Melody</a>
        </div>
    </div>
</nav>

<div class="jumbotron">
    <div class="container">
        <h1>${title}</h1>

        <h2>Song Id</h2>

        <p>
            ${songid}

        <p>

        <h2>Song Title</h2>

        <p>
            ${songtitle}
        </p>

        <h2>Hello js melody</h2>

        <p class="song-id">ID: </p>
        <p class="song-title">TITLE: </p>

        <a class="btn btn-primary btn-lg" href="#" role="button">why</a>
        </p>
    </div>
</div>

</body>
</html>