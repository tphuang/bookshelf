<!DOCTYPE HTML>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<html>
<head>
    <title>BookShelf Application</title>
    <link rel="stylesheet" href="/Users/tphuang/Projects/Java/bookshelf/src/main/webapp/style/douban.css" type="text/css"/>
    <link rel="stylesheet" href="/Users/tphuang/Projects/Java/bookshelf/src/main/webapp/style/main.css" type="text/css"/>
    <script type="text/javascript" src="/Users/tphuang/Projects/Java/bookshelf/src/main/webapp/scripts/jquery-1.10.2.js"></script>
    <script type="text/javascript" src="/Users/tphuang/Projects/Java/bookshelf/src/main/webapp/scripts/jquery-1.4.2.js"></script>
    <script type="text/javascript" src="/Users/tphuang/Projects/Java/bookshelf/src/main/webapp/scripts/pagination.js"></script>

</head>

<body class="center">
<div class="navbar">
    <div class="navbar-inner">
        <a class="brand" href="/bookshelf/home" class="nav_link">
            TW BookShelf
        </a>

        <ul class="nav">
            <li>
                <a href="/bookshelf/home">Home</a>
            </li>
            <li>
                <a href="/bookshelf/get-douban-collections-full">Books</a>
            </li>
            <li>
                <a href="/bookshelf/users">Users</a>
            </li>

            <li>
                <a href="/bookshelf/login">Login</a>
            </li>
            <li>
                <a href="/bookshelf/logout">Logout</a>
            </li>

        </ul>

    </div>
</div>

<script type="text/javascript">
    $(function(){
//        $(".collection-image-container").mouseover(function(){
//            $(this).children(".collection-info").show();
//
//        });
//        $(".collection-image-container").mouseout(function(){
//            $(this).children(".collection-info").hide();
//
//        });

    });
</script>
<script type="text/javascript" src="/scripts/dbapi_beta1_20120316.js"></script>
<div class="douban-collections-page">

    <input type='hidden' id='current_page' />
    <input type='hidden' id='items_per_page' />

    <table class="table douban-images center douban-collections" id="myDoubanCollection">

        <tr class="douban-collections-row">

            <td class="douban-collection">
                <div class="collection-image-container" >
                    <img class="collection-image" src="http://img5.douban.com/lpic/s11180398.jpg "/>
                    <div class="collection-info" id="first-collection">
                        <div class="suspension-box">
                            本书据剑桥大学出版社1965年版斯蒂文•朗西曼（Steven Runciman）所著The Fall of Constantinople 1453译出。全译本。
                            1453年5月，拜占庭首都君士坦丁堡被奥斯曼土耳其帝国攻陷，是世界历史中的一件大事。它不仅代表着拜占庭千年帝国的落幕，新兴伊斯兰强权的崛起，更为欧洲、近东带来了政治、经济、文化上的深刻变化，甚至一度被作为中世纪结束的标志之一。在长达7...
                            1453年5月，拜占庭首都君士坦丁堡被奥斯曼土耳其帝国攻陷，是世界历史中的一件大事。它不仅代表着拜占庭千年帝国的落幕，新兴伊斯兰强权的崛起，更为欧洲、近东带来了政治、经济、文化上的深刻变化，甚至一度被作为中世纪结束的标志之一。在长达7...
                            1453年5月，拜占庭首都君士坦丁堡被奥斯曼土耳其帝国攻陷，是世界历史中的一件大事。它不仅代表着拜占庭千年帝国的落幕，新兴伊斯兰强权的崛起，更为欧洲、近东带来了政治、经济、文化上的深刻变化，甚至一度被作为中世纪结束的标志之一。在长达7...
                        </div>
                        <span></span>
                    </div>
                </div>
                <div class="collection-title">人人时代</div>

            </td>


            <td class="douban-collection">
                <div class="collection-image-container" >
                    <img class="collection-image" src="http://img5.douban.com/lpic/s24503507.jpg "/>
                    <div class="collection-info clear">
                        本书据剑桥大学出版社1965年版斯蒂文•朗西曼（Steven Runciman）所著The Fall of Constantinople 1453译出。全译本。
                        1453年5月，拜占庭首都君士坦丁堡被奥斯曼土耳其帝国攻陷，是世界历史中的一件大事。它不仅代表着拜占庭千年帝国的落幕，新兴伊斯兰强权的崛起，更为欧洲、近东带来了政治、经济、文化上的深刻变化，甚至一度被作为中世纪结束的标志之一。在长达7...
                    </div>
                </div>
                <div class="collection-title">先锋</div>

            </td>


            <td class="douban-collection">
                <div class="collection-image-container" >
                    <img class="collection-image" src="http://img3.douban.com/lpic/s27174102.jpg "/>
                    <div class="collection-info clear">
                        本书据剑桥大学出版社1965年版斯蒂文•朗西曼（Steven Runciman）所著The Fall of Constantinople 1453译出。全译本。
                        1453年5月，拜占庭首都君士坦丁堡被奥斯曼土耳其帝国攻陷，是世界历史中的一件大事。它不仅代表着拜占庭千年帝国的落幕，新兴伊斯兰强权的崛起，更为欧洲、近东带来了政治、经济、文化上的深刻变化，甚至一度被作为中世纪结束的标志之一。在长达7...
                    </div>
                </div>
                <div class="collection-title">看板方法</div>

            </td>


        <tr class="douban-collections-row">

            <td class="douban-collection">
                <div class="collection-image-container" >
                    <img class="collection-image" src="http://img3.douban.com/lpic/s27123141.jpg "/>
                    <div class="collection-info clear">
                        本书据剑桥大学出版社1965年版斯蒂文•朗西曼（Steven Runciman）所著The Fall of Constantinople 1453译出。全译本。
                        1453年5月，拜占庭首都君士坦丁堡被奥斯曼土耳其帝国攻陷，是世界历史中的一件大事。它不仅代表着拜占庭千年帝国的落幕，新兴伊斯兰强权的崛起，更为欧洲、近东带来了政治、经济、文化上的深刻变化，甚至一度被作为中世纪结束的标志之一。在长达7...
                    </div>
                </div>
                <div class="collection-title">Java核心技术·卷1：基础知识（原书第9版）</div>

            </td>


            <td class="douban-collection">
                <div class="collection-image-container" >
                    <img class="collection-image" src="http://img3.douban.com/lpic/s5843032.jpg "/>
                    <div class="collection-info clear">
                        本书据剑桥大学出版社1965年版斯蒂文•朗西曼（Steven Runciman）所著The Fall of Constantinople 1453译出。全译本。
                        1453年5月，拜占庭首都君士坦丁堡被奥斯曼土耳其帝国攻陷，是世界历史中的一件大事。它不仅代表着拜占庭千年帝国的落幕，新兴伊斯兰强权的崛起，更为欧洲、近东带来了政治、经济、文化上的深刻变化，甚至一度被作为中世纪结束的标志之一。在长达7...
                    </div>
                </div>
                <div class="collection-title">Web开发敏捷之道</div>

            </td>


            <td class="douban-collection">
                <div class="collection-image-container" >
                    <img class="collection-image" src="http://img5.douban.com/lpic/s6163317.jpg "/>
                    <div class="collection-info clear">
                        本书据剑桥大学出版社1965年版斯蒂文•朗西曼（Steven Runciman）所著The Fall of Constantinople 1453译出。全译本。
                        1453年5月，拜占庭首都君士坦丁堡被奥斯曼土耳其帝国攻陷，是世界历史中的一件大事。它不仅代表着拜占庭千年帝国的落幕，新兴伊斯兰强权的崛起，更为欧洲、近东带来了政治、经济、文化上的深刻变化，甚至一度被作为中世纪结束的标志之一。在长达7...
                    </div>
                </div>
                <div class="collection-title">Ruby on Rails实践之路</div>

            </td>


        <tr class="douban-collections-row">

            <td class="douban-collection">
                <div class="collection-image-container" >
                    <img class="collection-image" src="http://img5.douban.com/lpic/s26814749.jpg "/>
                    <div class="collection-info clear">
                        本书据剑桥大学出版社1965年版斯蒂文•朗西曼（Steven Runciman）所著The Fall of Constantinople 1453译出。全译本。
                        1453年5月，拜占庭首都君士坦丁堡被奥斯曼土耳其帝国攻陷，是世界历史中的一件大事。它不仅代表着拜占庭千年帝国的落幕，新兴伊斯兰强权的崛起，更为欧洲、近东带来了政治、经济、文化上的深刻变化，甚至一度被作为中世纪结束的标志之一。在长达7...
                    </div>
                </div>
                <div class="collection-title">Cucumber：行为驱动开发指南</div>

            </td>


            <td class="douban-collection">
                <div class="collection-image-container" >
                    <img class="collection-image" src="http://img5.douban.com/lpic/s3668809.jpg "/>
                    <div class="collection-info clear">
                        本书据剑桥大学出版社1965年版斯蒂文•朗西曼（Steven Runciman）所著The Fall of Constantinople 1453译出。全译本。
                        1453年5月，拜占庭首都君士坦丁堡被奥斯曼土耳其帝国攻陷，是世界历史中的一件大事。它不仅代表着拜占庭千年帝国的落幕，新兴伊斯兰强权的崛起，更为欧洲、近东带来了政治、经济、文化上的深刻变化，甚至一度被作为中世纪结束的标志之一。在长达7...
                    </div>
                </div>
                <div class="collection-title">卓有成效的程序员</div>

            </td>


            <td class="douban-collection">
                <div class="collection-image-container" >
                    <img class="collection-image" src="http://img5.douban.com/lpic/s26334086.jpg "/>
                    <div class="collection-info clear">
                        本书据剑桥大学出版社1965年版斯蒂文•朗西曼（Steven Runciman）所著The Fall of Constantinople 1453译出。全译本。
                        1453年5月，拜占庭首都君士坦丁堡被奥斯曼土耳其帝国攻陷，是世界历史中的一件大事。它不仅代表着拜占庭千年帝国的落幕，新兴伊斯兰强权的崛起，更为欧洲、近东带来了政治、经济、文化上的深刻变化，甚至一度被作为中世纪结束的标志之一。在长达7...
                    </div>
                </div>
                <div class="collection-title">善用佳软</div>

            </td>
    </table>
    <div id='page_navigation'></div>
    <p><a href="/bookshelf/home"> Back</a></p>
</div>

<br/> <hr />
<p class="footer center">
    TW BookShelf - powered by Tingpeng !
</p>

</body>
</html>
