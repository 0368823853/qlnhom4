<%-- 
    Document   : Emp_CaNhan
    Created on : Jun 3, 2024, 12:15:08 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--=== Coding by CodingLab | www.codinglabweb.com === -->
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <!----======== CSS ======== -->
    <link rel="stylesheet" href="../Assets/CSS/Emp_CSS.css">
     
    <!----===== Iconscout CSS ===== -->
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">

    <title>Admin Dashboard Panel</title> 
</head>
<body>
    <nav>
        <div class="logo-name">
            <div class="logo-image">
                <img src="../Assets/img/logo.png" alt="">
            </div>

            <span class="logo_name">TopsMarket</span>
        </div>

        <div class="menu-items">
            <ul class="nav-links">
                <li><a href="#">
                    <i class="uil uil-estate"></i>
                    <span class="link-name">Dahsboard</span>
                </a></li>
                <li><a href="#">
                    <i class="uil uil-user"></i>
                    <span class="link-name">Cá Nhân</span>
                </a></li>
                <li><a href="#">
                    <i class="uil uil-notes"></i>
                    <span class="link-name">Chấm Công</span>
                </a></li>
                <li><a href="#">
                    <i class="uil uil-file-check-alt"></i>
                    <span class="link-name">Nghỉ Phép</span>
                </a></li>
                <li><a href="#">
                    <i class="uil uil-usd-circle"></i>
                    <span class="link-name">Lương</span>
                </a></li>
            </ul>
            
            <ul class="logout-mode">
                <li><a href="#">
                    <i class="uil uil-signout"></i>
                    <span class="link-name">Logout</span>
                </a></li>

                <li class="mode">
                    <a href="#">
                        <i class="uil uil-moon"></i>
                    <span class="link-name">Dark Mode</span>
                </a>

                <div class="mode-toggle">
                  <span class="switch"></span>
                </div>
            </li>
            </ul>
        </div>
    </nav>

    <section class="dashboard">
        <div class="top">
            <i class="uil uil-bars sidebar-toggle"></i>

            <div class="search-box">
                <i class="uil uil-search"></i>
                <input type="text" placeholder="Search here...">
            </div>
            
            <img src="../Assets/img/profile.jpg" alt="">
        </div>

        
            <!-- viết code tại đây -->


        </div>
    </section>

    <script src="../Assets/JavaScript/Emp_JavaScript.js"></script>
</body>
</html>