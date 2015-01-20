<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--[if lt IE 7]> <html class="no-js no-responsive ie lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="no-js no-responsive ie ie7 lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="no-js no-responsive ie ie8 lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]> <html class="no-js responsive ie" lang="en"> <![endif]-->
<!--[if !IE]> -->
<html class="no-js responsive" lang="en">                    <!-- <![endif]-->
<head>
    <title>AAMI Home Insurance | Your Quote</title>

    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta name="author" content="">
    <%--ClearType主要是针对LCD液晶显示器设计，可提高文字的清晰度。--%>
    <meta http-equiv="cleartype" content="on">
    <%--如果IE有安装Chrome Frame，那么就走安装的组件，Edge模式通知 IE以最高级别的可用模式显示内容--%>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <%--屏蔽自动将连串数字转换为拨号超链接--%>
    <meta name="format-detection" content="telephone=no">
    <%--全屏显示，即隐藏顶部导航栏以及底部工具栏--%>
    <meta name="apple-mobile-web-app-capable" content="yes">
    <%--浏览器状态栏样式,系统状态栏是设备顶部显示运营商、WIFI、时间的部分，它无法隐藏，但可以设置灰、黑两种风格--%>
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent">
    <link rel="apple-touch-startup-image" href="splash.png">


    <link rel="shortcut icon" href="../app-resources/bower_components/sg-base/dist/aami/favicon.ico"/>


    <link rel="stylesheet" type="text/css" href="../app-resources/bower_components/normalize-css/normalize.css">

    <link rel="stylesheet" type="text/css" href="../app-resources/home/aami/css/aami-home.css"/>
    <link rel="stylesheet" href="<c:url value='/style/test.css' />" type="text/css"/>

    <div class="loading-icon" style="width: 0px;height:0px; margin: 0;position: fixed;top: -500px;"></div>


    <script type="text/javascript" src="../app-resources/bower_components/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="../app-resources/bower_components/modernizr/modernizr.js"></script>
    <script type="text/javascript" src="../app-resources/bower_components/sg-lib-input/lib-input.min.js"></script>
    <script type="text/javascript"
            src="../app-resources/bower_components/sg-lib-jqueryui/lib-jquery-ui.min.js"></script>
    <script type="text/javascript" src="../app-resources/home/common/js/styleguide.generated.js"></script>


    <!--[if IE]>
    <script type="text/javascript" src="../app-resources/bower_components/sg-lib-es5/es5-shim.custom.min.js"></script>
    <script type="text/javascript" src="../app-resources/home/common/js/html5shiv-printshiv.js"></script>
    <![endif]-->

    <script type="text/javascript" src="../app-resources/home/aami/js/lib/underscore-min.js"></script>

    <script type="text/javascript"
            src="https://assets.suncorp.com.au/app-resources/common/js/lib/jquery.numeric.js"></script>


    <script type="text/javascript"
            src="https://assets.suncorp.com.au/app-resources/common/js/lib/xdate.min.js"></script>
    <script type="text/javascript" src="https://assets.suncorp.com.au/app-resources/common/js/lib/json2.js"></script>


    <script type="text/javascript" src="../app-resources/home/common/js/jquery-migrate-1.2.1.min.js"></script>
    <script type="text/javascript"
            src="https://assets.suncorp.com.au/app-resources/common/js/lib/jquery.filter_input.js"></script>
    <style>

    </style>

</head>

<body id="quote-schedule-aami" class="Layout-stickyFooter  quote-schedule-aami">


<input type="hidden" id="defaultNophoneFallbackUrl" value="http://www.aami.com.au/contact-aami/contact-details"/>
<script type="text/javascript">
    sg.tel.defaultNophoneFallbackUrl = $("#defaultNophoneFallbackUrl").val();
</script>


<script type="text/javascript">
    /* The Datalicious cache buster generates a date stamp that is added to the
     datalicious.js file request below to avoid caching */
    var cbd = new Date();
    cbd = cbd.getUTCDate().toString() + cbd.getUTCHours().toString();
    /* The datalicious.js file loads all other web analytics files including
     the Omniture s_code.js */
    document.write('\x3Cscr' + 'ipt type="text/javascript" src="//assets.suncorp.com.au/js/datalicious.js?cb=' + cbd + '"\x3E\x3C/scr' + 'ipt\x3E')
</script>
<script type="text/javascript">
    /* The Datalicious top d.t() function is defined in the datalicious.js file
     and triggers all web analytics server requests including the Omniture s.t
     function */
    if (typeof d != 'undefined') if (typeof d.t == 'function') d.t();
</script>
<noscript><p class='browser-alert'>If you're receiving this error message, it means that you have <b>JavaScript turned
    off</b> in your browser. <br/>
    Please turn on <b>JavaScript</b> and try again.
</p></noscript>

<div class="Page">
<header class="Header">
    <div class="Header-content">

        <div class="Header-logoSection">
            <a class="Header-logo"></a>
        </div>
        <div class="Header-textSection">
            <h1>Home Insurance</h1>

            <ul class="Header-subtext Type-horizBarList">
                <li>
                    <span class="sml-hidden">Need help? Call us anytime:</span>
                    <a href="tel:132244" class="Type-phone"> 13 22 44</a>
                </li>
                <li><a class="lrg-hidden call-me" target="_blank"
                       onclick="window.open('/home/callme/callme.html#/?brand=aami&product=home&quote=QTE001216859',
                                               '_target', 'width=750, height=550, toolbar=0,menubar=0,location=0,status=1,resizable=0');return false;">Call
                    me</a></li>
            </ul>

        </div>
    </div>
</header>

<main id="main-wrapper" class="Main">
<div class="Main-content" id="main">

<script>
    $(document).ready(function () {
        home.sg.quoteSchedule(false);
    });
</script>

<form id="quoteSchedule" action="/home/pub/aamiretrievequote?execution=e1s3" method="post">
<div class="panel-right">


    <div class="quote-number compact aami-med-sml-hidden">
        <span class="text">Your quote number:</span>
        <span class="number">QTE001216859</span>
    <span class="date">
        Valid until 30th November 2014
    </span>
    </div>


    <div class="sticky-panel-wrapper mobile-enabled QSP-mobile" id="qsp-pricing-tabs">
        <div class="sticky-panel" id="rhs-wrapper">
            <div id="pricingTabs" class="block-ui quote-panel">
                <div class="mobile-panel mobile-sticky-wrapper">
                    <div class="panel-tabs ">
                        <input type="hidden" class="premiumData" name="paymentMode" id="paymentMode" value="YEARLY"/>
                        <label class="quote-option-annual tab-active u-marginNone" data-paymentMode="YEARLY">Pay
                            Annually</label>
                        <label class="quote-option-monthly tab-inactive u-marginNone" data-paymentMode="MONTHLY">Pay
                            Monthly</label>
                    </div>

                    <div class=" quote-container-annual quote-container-active">
                        <div class="panel panel-top-half no-top-left-corner quote-price">
                            <div class="panel-content">
                        <span class="withPersonalValuables">

                            <h1 class="premium">$456.46</h1>
                        </span>

                                <p class="legal">
                                    *Incl. GST and gov't charges
                                </p>

                        <span>
<button class="btn btn-buy sg-u-uppercase" type="submit" id="_eventId_submit" name="_eventId_submit">Buy <span>Online Now</span>
</button></span>

                                <div class="QSP-buttonSpacingHackTop"></div>
                            </div>
                        </div>
                        <div class="panel panel-bottom-half quote-payment-options disable-inline">
                            <div class="QSP-buttonSpacingHackBottom"></div>
                            <div class="panel-content">
                                <div class="quote-payment-methods" id="annualPaymentOptions">
                                    <span class="Icon-paymentVisa--default Icon-large"></span>
                                    <span class="Icon-paymentMasterCard--default Icon-large"></span>
                                    <span class="Icon-paymentAmericanExpress--default Icon-large"></span>
                                    <span class="Icon-paymentPhone--default Icon-large"></span>
                                    <span class="Icon-paymentBPay--default Icon-large"></span>
                                    <span class="Icon-paymentAusPost--default Icon-large"></span>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="quote-container-monthly quote-container-inactive hidden">
                        <div class="panel panel-top-half no-top-left-corner quote-price">
                            <div class="panel-content">
                        <span class="withPersonalValuables">

                            <h1 class="premium">$456.46</h1>
                        </span>

                                <p class="legal">
                                    *Incl. GST and gov't charges


                                    <br>(It's cheaper to pay annually)


                                </p>


                        <span>
<button class="btn btn-buy sg-u-uppercase" type="submit" id="_eventId_submit" name="_eventId_submit">Buy <span>Online Now</span>
</button></span>

                                <div class="QSP-buttonSpacingHackTop"></div>
                            </div>
                        </div>
                        <div class="panel panel-bottom-half disable-padding">
                            <div class="QSP-buttonSpacingHackBottom"></div>
                            <div class="panel-content quote-payment-options disable-inline">
                                <div class="quote-payment-methods" id="monthlyPaymentOptions">
                                    <span class="Icon-paymentVisa--default Icon-large"></span>
                                    <span class="Icon-paymentMasterCard--default Icon-large"></span>
                                    <span class="Icon-paymentAmericanExpress--default Icon-large"></span>

                                    <p id="yourBankAccountText">Or pay by bank account</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="panel quote-email" id="saveEmailQuoteWrapper">
                    <a class="btn-toggle" data-target="#quoteEmailContent" data-self-dismiss="true" href="#"><span
                            class="Icon-email--default Icon--small"></span>Email me this quote</a>

                    <div id="quoteEmailContent" class="panel-content">
                        <label for="emailAddress">
                            <div class="med-sml-hidden">
                                <b>Save this quote for later</b>

                                <p><span
                                        class="note">We will email your quote and may send you one or more reminders.</span>
                                </p>
                            </div>
                            <div class="lrg-hidden">
                                <span><b>Save your quote</b></span>

                                <p>Enter your email and we will send your quote to you.</p>
                                <span><b>Enter your email:</b></span>
                            </div>
                        </label>

                        <div class="quote-email-container">
                            <input type="email" class="quote-email-text" id="emailAddress" placeholder="me@email.com">
                            <button type="button" id="emailButton" name="emailButton"
                                    class="quote-email-btn btn-secondary">Send
                            </button>
                            <div id="emailSuccessText" class="email-success-text hidden">
                                An email has been sent to you.
                            </div>
                        </div>
                    </div>

                    <div class="lrg-hidden">
                        <span class="text">Your quote number:</span>
                        <strong class="number">QTE001216859</strong><br/>
               <span class="date">
                   Valid until 30th November 2014
               </span>
                    </div>
                </div>
            </div>
        </div>

        <div class="sticky-sub-panel">


            <div class="help-panel med-sml-hidden">
                <h3>Have a question?<br/>Need help?</h3>
                <h4>Talk to us now</h4>

                <a href="#" class="help-option Icon-mobile--default"
                   onclick="window.open('/home/callme/callme.html#/?brand=aami&product=home&quote=',
                   '_target', 'width=750, height=550, toolbar=0,menubar=0,location=0,status=1,resizable=0');return false;">
                    <p class="link">Request a Call-Back</p>

                    <p>An AAMI representative will call you back</p>
                </a>


                <a href="tel:132244" class="help-option Icon-24Hours--default"
                   data-nophone-fallback-url="http://www.aami.com.au/contact-aami/contact-details">
                    <p><b>Call us on 13 22 44</b></p>

                    <p>We are open 24/7</p>
                </a>
            </div>


        </div>
    </div>
</div>

<div class="column-left">
<h2>


    Thanks for choosing AAMI home insurance

</h2>

<div id="errors" class="hidden"></div>


<hr class="invisible"/>
<div id="qsp-discounts">
    <b>We have applied the following discounts to your premium</b>
    <ul class="ticklist horizontal">
        <li>


            $50 Online discount
        </li>
        <li>


            Up to 10&#37; Combined Building &amp; Contents discount
        </li>
    </ul>
</div>


<div id="promotional-banner" class="important sml-hidden">
    <h2>Three easy ways to lock in your $50 discount</h2>
    <ul class="iconlist35 horizontal">
        <li>
            <span class="Icon-computer--secondary Icon-large"></span>
            Buy online now
        </li>
        <li>
            <span class="Icon-24Hours--secondary Icon-large"></span>
            Call us on <a href="tel: 132244" class="Type-phone">13 22 44</a></li>
        <li>
            <span class="Icon-email--secondary Icon-large"></span>
            Email your quote for later
        </li>
    </ul>
</div>


<fieldset class="question-group withicon Icon-calendar--default">
    <label class="QuestionGroupTitle">Policy start date</label>

    <div id="modify-policy-start-date-dialog" title="Modify policy start date" class="hidden">
        <p>As you have changed your policy start date we need to reconfirm some of your quote details.</p>
    </div>

    <div id="past-policy-start-date-dialog" title="Policy start date" data-modal-width="500" class="hidden">
        <p><strong>Thank you for retrieving your quote</strong></p>

        <p>Your originally chosen policy start date has now passed.</p>

        <p>We have updated your policy's start date to today's date but you can choose a new date.</p>

        <p>We will recalculate your insurance price based on your new start date.</p>
    </div>

    <input type="hidden" id="pastPolicyStartDate" value="false" disabled="disabled"/>
    <input type="submit" id="_eventId_modifyEffectiveDate" name="_eventId_modifyEffectiveDate"
           value="Modify effective date" class="hidden"/>


    <div class="question">

        Your policy start date must be within 38 days of today.</p>


        <input id="policyStartDate" name="effectiveDate" type="text" class="date-picker size-small prominent"
               value="23/10/2014" readonly
               placeholder="DD/MM/YYYY" min='0' max='38'/>


    </div>
</fieldset>


<fieldset class="question-group withicon Icon-home--default" id="homeSumInsured-section">
    <label class="QuestionGroupTitle">Building sum insured</label>


    <a class="helplink modal" title="Building sum insured" href="#help-quoteSchedule-buildingSumInsured"
       data-content-id="help-quoteSchedule-buildingSumInsured" data-modal-width="300">Help</a>

    <div id="help-quoteSchedule-buildingSumInsured" class="hidden"><p>At AAMI, we offer two options for your Home
        Building
        Insurance cover - each with their own benefits and considerations:

        <p>
        <ul>
            <li><strong>Sum Insured (Standard)</strong><br/> Have a good idea of how much it will cost to rebuild your
                home?
                A Sum Insured policy lets you set the maximum amount covered. So if your home is destroyed or damaged by
                an
                insured event, we will pay for the repair or rebuilding of your home up to the sum insured that you’ve
                set.
            </li>
            <li><strong>Complete Replacement Cover (Optional Extra)</strong><br/> Don’t want to set a limit for
                rebuilding
                your home? AAMI’s Complete Replacement Cover option will cover the repair or rebuilding of your home if
                it
                is damaged or destroyed by an insured event, no matter the cost to us. Some limits and conditions apply,
                see
                the <a href="http://www.aami.com.au/home-insurance/policy-documents" target="_blank">PDS</a> for
                details.
            </li>
        </ul>
    </div>

    <div class="question">

        <p>AAMI offers two types of cover for your Building Insurance: Choose a <strong>Sum Insured policy</strong>
            and set a maximum amount covered or <strong>Complete Replacement Cover option</strong>.</p>

        <div class="radio-options">
            <input id="buildingSumInsuredType-sumInsured" name="buildingSumInsuredType" class="premiumData" type="radio"
                   value="SUM_INSURED" checked="checked"/>


            <label for="buildingSumInsuredType-sumInsured">
                <b>


                    Sum insured

                </b><br/>

                <div class="columns-group">
                    <div id="buildingSumLimitContainer" class="col size-medlarge">
                        <p>


                            You can adjust your sum insured between <strong id="minRebuildCost">$183,000</strong> and
                            <strong
                                    id="maxRebuildCost">$313,000</strong>

                        </p>
                    </div>
                    <div id="buildingSumInputContainer" class="col size-medsmall">


                        <div class="currency">
                            <span>$</span>
                            <input class="numeric premiumData size-xsmall prominent" type="text" id="buildingSum"
                                   name="buildingSum"
                                   min-data='183000' max='313000' value='262000'>
                        </div>


                    </div>
                </div>
                <div id="blankValueText" class="hidden errors buildingSum-errors">
                    <p>


                        Please enter an amount for which you would like your building insured.

                    </p>
                </div>
                <div id="invalidValueText" class="hidden errors buildingSum-errors">
                    <p>


                        Please enter a valid building sum insured before continuing.

                    </p>
                </div>
                <div id="belowMinValueText" class="hidden errors buildingSum-errors">
                    <p>


                        The sum insured you have entered is too low, please enter a value above $183,000.
                    </p>
                </div>
                <div id="aboveMaxValueText" class="hidden errors buildingSum-errors">
                    <p>


                        The sum insured you have entered is too high, please enter a value below $313,000.
                    </p>
                </div>
            </label>
            <input type="hidden" name="previousValidBuildingSumInsured" id="previousValidBuildingSumInsured"
                   value="262,000"/>
            <input id="buildingSumInsuredType-crc" name="buildingSumInsuredType" class="premiumData" type="radio"
                   value="CRC"/>
            <label for="buildingSumInsuredType-crc">
                <b>


                    Complete Replacement Cover option

                </b><br/>


                AAMI’s Complete Replacement Cover option is your best protection against underinsurance. We will cover
                the
                rebuilding of your home if it is damaged or destroyed by an insured event, no matter the cost to us.
                Some limits
                apply.


            </label>
        </div>
    </div>
</fieldset>


<fieldset class="question-group withicon Icon-contents--default">
    <p><b>Contents sum insured</b>


        <a class="helplink modal" title="Contents sum insured" href="#help-quoteSchedule-contentsSumInsured-question"
           data-content-id="help-quoteSchedule-contentsSumInsured-question" data-modal-width="300">Help</a>

    <div id="help-quoteSchedule-contentsSumInsured-question" class="hidden">The most we will pay for any one insured
        incident is the general contents sum insured (which includes any specified contents) plus any portable personal
        valuables sums insured.
    </div>
    </p>
    <div class="question">
        <table class="ContentsSumInsuredTable">
            <tbody>
            <tr>
                <td id="totalContentsSumInsured" class="ContentsSumInsuredTable-column1">


                    Contents at the home


                </td>
                <td id="totalContentsSumInsured" class="ContentsSumInsuredTable-column2">
                    <span class="prominent">$3,000</span>
                </td>

                <td class="ContentsSumInsuredTable-column3">
                    <input id="modifyContentAmount" type="submit" name="_eventId_content" value="Modify" class="link"/>
                </td>

            </tr>

            </tbody>
        </table>
    </div>
</fieldset>


<fieldset class="question-group withicon Icon-pay--default">
<b>


    <label class="">
        Adjust your Flexi-Premium<sup>&#174;</sup> excess


        <a class="helplink modal" title="Flexi-Premium<sup>&#174;</sup> excess" href="#help-quoteSchedule-excesses"
           data-content-id="help-quoteSchedule-excesses" data-modal-width="300">Help</a>

        <div id="help-quoteSchedule-excesses" class="hidden"><p>This is the amount you have to pay for each incident if
            you make a claim. Sometimes you have to pay more than one type of excess.</p>

            <p>The amount and type of excesses that apply to your policy are shown on your Certificate of Insurance and
                described in the <a href="http://www.aami.com.au/home-insurance/policy-documents"
                                    target="_blank">PDS</a>.</p>

            <p>More excesses available offline: $200, $600 or $5,000. Please contact us on <a href="tel: 132244"
                                                                                              class="Type-phone"> 13 22
                44</a> for a tailored quote.</p></div>


    </label></b>


<div class="question">

<div id="buildingExcess">
    <p>


        Building Excess:

    </p>
</div>


<div class="radio-scale js-BuildingExcess excess-options" id="buildingExcessContainer">

    <div class="radio-scale-element">
        <input id="buildingExcess1" name="buildingExcess" class="premiumData" type="radio" value="100"/>
        <label for="buildingExcess1">

                <span id="buildingExcess1-value">
                    $100
                </span>
        </label>
    </div>

    <div class="radio-scale-element">
        <input id="buildingExcess2" name="buildingExcess" class="premiumData" type="radio" value="300"/>
        <label for="buildingExcess2">

                <span id="buildingExcess2-value">
                    $300
                </span>
        </label>
    </div>

    <div class="radio-scale-element">
        <input id="buildingExcess3" name="buildingExcess" class="premiumData" type="radio" value="500"/>
        <label for="buildingExcess3">

                <span id="buildingExcess3-value">
                    $500
                </span>
        </label>
    </div>

    <div class="radio-scale-element">
        <input id="buildingExcess4" name="buildingExcess" class="premiumData" type="radio" value="750"/>
        <label for="buildingExcess4">

                <span id="buildingExcess4-value">
                    $750
                </span>
        </label>
    </div>

    <div class="radio-scale-element">
        <input id="buildingExcess5" name="buildingExcess" class="premiumData" type="radio" value="1000"
               checked="checked"/>
        <label for="buildingExcess5">

                <span id="buildingExcess5-value">
                    $1,000
                </span>
        </label>
    </div>

    <div class="radio-scale-element">
        <input id="buildingExcess6" name="buildingExcess" class="premiumData" type="radio" value="1500"/>
        <label for="buildingExcess6">

                <span id="buildingExcess6-value">
                    $1,500
                </span>
        </label>
    </div>

    <div class="radio-scale-element">
        <input id="buildingExcess7" name="buildingExcess" class="premiumData" type="radio" value="2000"/>
        <label for="buildingExcess7">

                <span id="buildingExcess7-value">
                    $2,000
                </span>
        </label>
    </div>

    <div class="radio-scale-element">
        <input id="buildingExcess8" name="buildingExcess" class="premiumData" type="radio" value="3000"/>
        <label for="buildingExcess8">

                <span id="buildingExcess8-value">
                    $3,000
                </span>
        </label>
    </div>

</div>


<div id="contentsExcess">
    <p>


        Contents Excess:

    </p>
</div>


<div class="radio-scale excess-options" id="contentsExcessContainer">

    <div class="radio-scale-element">
        <input id="contentsExcess1" name="contentsExcess" class="premiumData" type="radio" value="100"/>
        <label for="contentsExcess1">

                <span id="contentsExcess1-value">
                    $100
                </span>
        </label>
    </div>

    <div class="radio-scale-element">
        <input id="contentsExcess2" name="contentsExcess" class="premiumData" type="radio" value="300"/>
        <label for="contentsExcess2">

                <span id="contentsExcess2-value">
                    $300
                </span>
        </label>
    </div>

    <div class="radio-scale-element">
        <input id="contentsExcess3" name="contentsExcess" class="premiumData" type="radio" value="500"
               checked="checked"/>
        <label for="contentsExcess3">

                <span id="contentsExcess3-value">
                    $500
                </span>
        </label>
    </div>

    <div class="radio-scale-element">
        <input id="contentsExcess4" name="contentsExcess" class="premiumData" type="radio" value="750"/>
        <label for="contentsExcess4">

                <span id="contentsExcess4-value">
                    $750
                </span>
        </label>
    </div>

    <div class="radio-scale-element">
        <input id="contentsExcess5" name="contentsExcess" class="premiumData" type="radio" value="1000"/>
        <label for="contentsExcess5">

                <span id="contentsExcess5-value">
                    $1,000
                </span>
        </label>
    </div>

    <div class="radio-scale-element">
        <input id="contentsExcess6" name="contentsExcess" class="premiumData" type="radio" value="1500"/>
        <label for="contentsExcess6">

                <span id="contentsExcess6-value">
                    $1,500
                </span>
        </label>
    </div>

    <div class="radio-scale-element">
        <input id="contentsExcess7" name="contentsExcess" class="premiumData" type="radio" value="2000"/>
        <label for="contentsExcess7">

                <span id="contentsExcess7-value">
                    $2,000
                </span>
        </label>
    </div>

    <div class="radio-scale-element">
        <input id="contentsExcess8" name="contentsExcess" class="premiumData" type="radio" value="3000"/>
        <label for="contentsExcess8">

                <span id="contentsExcess8-value">
                    $3,000
                </span>
        </label>
    </div>

</div>


<div id="vary-excess-info">
    Other excesses may apply.
            <span id="excessesDetailsLink">
                <a href="#excessesDetailsSection">Read more</a>.
            </span>
</div>
<div class="errors hidden" id="buildingExcessError">
    <p>Building Excess field invalid.</p>
</div>
<div class="errors hidden" id="contentsExcessError">
    <p>Contents Excess field invalid.</p>
</div>
</div>


</fieldset>


<fieldset class="question-group withicon Icon-policy--default">
<label class="QuestionGroupTitle">Your quote details</label>
<ul class="QSPQuoteDetailsHeading-links horizontal payment-confirmation-links">
    <li class="Print-button">
        <span class="Icon-print--dark Icon-xsmall"></span>
        <a class="print-quote" href="#">Print</a>
    </li>
    <li>
        <span class="Icon-file--dark Icon-xsmall"></span>
        <a href="http://www.aami.com.au/home-insurance/policy-documents" class="Type-small pdsWindow policy-documents"
           target="_blank">Policy documents</a>
    </li>
</ul>


<input id="toOtherExcess" type="hidden" value="false">

<div class="question">
<table class="detailstable">
    <tbody>
    <tr>
        <td colspan="2">
            <p>
                <b>Cover details</b>
            </p>
        </td>
    </tr>
    <tr>
        <td class="width40">
            <strong>Quote valid to:</strong>
        </td>
        <td>30th November 2014</td>
    </tr>
    <tr>
        <td class="width40">
            <strong>Policy type:</strong>
        </td>
        <td>
            Building & Contents, 12 month policy
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <div id="excessesDetailsSection" name="excessesDetailsSection"></div>
            <p><b>Your excesses</b></p>
            <span>The following excesses apply in addition to any other excess:</span>
        </td>
    </tr>

    <tr>
        <td colspan="2">
            <div class="width60 QuoteDetailsTable-inline"><strong class="divided">Unoccupied excess</strong></div>
            $1,000

            <div><span class="blurb">Applies when you claim for loss or damage to your building or contents, which occurs when the building or unit has been unoccupied for more than 60 continuous days.</span>
            </div>
        </td>
    </tr>

    </tbody>
</table>

<table id="quoteSummary-container" class="detailstable hidden">
    <tbody>
    <tr>
        <td colspan="2">
            <p>
                <b>Quote details</b>
            </p>
        </td>
    </tr>
    <tr>
        <td class="width40"><strong>


            Use of home

        </strong></td>
        <td>I own and live in the home - Permanent residence</td>
    </tr>
    <tr>
        <td class="width40"><strong>


            Insured address

        </strong></td>
        <td>Level 1, 440 COLLINS ST, Melbourne VIC 3000</td>
    </tr>
    <tr>
        <td class="width40"><strong>


            DOB of oldest policy holder

        </strong></td>
        <td>10/10/1980</td>
    </tr>
    <tr>
        <td class="width40"><strong>


            Current or most recent insurer

        </strong></td>
        <td>NRMA</td>
    </tr>
    <tr>
        <td class="width40"><strong>


            Building type

        </strong></td>
        <td>Free standing home - A concrete slab

        </td>
    </tr>

    <tr>
        <td class="width40"><strong>


            Wall material

        </strong></td>
        <td>Weatherboard/Wood</td>
    </tr>
    <tr>
        <td class="width40"><strong>


            Roof material

        </strong></td>
        <td>Timber</td>
    </tr>
    <tr>
        <td class="width40"><strong>


            Year of construction

        </strong></td>
        <td>2000-2004</td>
    </tr>
    <tr>
        <td class="width40"><strong>


            Home security

        </strong></td>
        <td>


            <ul class="no-indent">


                <li>Burglar alarm, not monitored by a security provider</li>


            </ul>

        </td>
    </tr>

    <tr>
        <td class="width40"><strong>


            Construction standard

        </strong></td>
        <td>Standard quality</td>
    </tr>
    <tr>
        <td class="width40"><strong>


            Slope of land

        </strong></td>
        <td>Gentle</td>
    </tr>
    <tr>
        <td class="width40"><strong>


            Levels of home

        </strong></td>
        <td>1</td>
    </tr>
    <tr>
        <td class="width40"><strong>


            Number of bedrooms

        </strong></td>
        <td>3</td>
    </tr>
    <tr>
        <td class="width40"><strong>


            Size of main bedroom

        </strong></td>
        <td>Small to average</td>
    </tr>
    <tr>
        <td class="width40"><strong>


            Number of bathrooms

        </strong></td>
        <td>4</td>
    </tr>
    <tr>
        <td class="width40"><strong>


            Number of garages/carports

        </strong></td>
        <td>1</td>
    </tr>
    <tr>
        <td class="width40"><strong>


            Outbuildings and features

        </strong></td>
        <td>
            None

        </td>
    </tr>

    </tbody>
</table>
<div id="quoteSummarySwitch">
    <a href="#">View Quote Summary</a>
</div>
</div>

</fieldset>
<div class="btn-bar">
    <button class="btn btn-prev" type="submit" id="_eventId_previous" name="_eventId_previous">Back</button>
</div>

</div>

</form>


<div id="floodCoverDialog" title="Flood cover" class="hidden">
    <p>You have decided to remove cover for flood from your policy. You will not be able to add cover back on
        until your policy renews or in the event you change your insured address.</p>

    <p>This means that you will have <b>NO</b> cover for flood during the period of insurance at this insured address.
    </p>

    <p>Do you still want to go ahead?</p>
</div>


</div>
</main>

<footer class="Footer">
    <div class="Footer-content">
        <ul class="Type-horizBarList">
            <li><a href="http://www.aami.com.au/customer-service/help-topics?term=Home" title="Common Questions"
                   target="_blank">Common Questions</a></li>
            <li><a href="http://www.aami.com.au/privacy" title="Online Terms & Privacy Statement" target="_blank">Online
                Terms &amp; Privacy Statement</a></li>
        </ul>
        <p class="Type-small Type-muted abn">&copy; AAI Limited ABN 48 005 297 807 AFSL No. 230859 trading as AAMI</p>
    </div>
</footer>


<div id="print-wrapper" class="hidden">

    <div id="print-heading">
        <img id="print-header-img" src="../app-resources/home/aami/img/print-header.png">
    </div>

    <div id="print-body">
        <div id="print-premium-wrapper">

            <div class="annualPremium">
                <h4>Annual premium </h4>
                <span class="printPremium"><div id="printAnnualPremium">$456.46</div></span>
                <span class="text-style4">*Incl. GST and gov't charges</span>
            </div>
            <div class="monthlyPremium hidden">
                <h4>Monthly premium </h4>
                <span class="printPremium"><div id="printMonthlyPremium">$456.46</div></span>
                <span class="text-style4">*Incl. GST and gov't charges</span>
                <span class="text-style4">It's cheaper to pay annually</span>
            </div>
        </div>

        <div id="print-quote-details-wrapper">
            <h5>Quote No. <span>QTE001216859</span></h5>
            <span class="validDate text-style2"> Valid until: 30th November 2014</span>

            <span class="paymentMethods text-style3">We accept the following payment methods</span>

           <span id="annualPaymentOption" class="annualPremium">
                <div class="annually">
                    <span><img src="../app-resources/home/common/img/icon_visa.png"></span>
                    <span><img src="../app-resources/home/common/img/icon_mastercard.png"></span>
                    <span><img src="../app-resources/home/common/img/icon_amex.png"></span>
                    <span><img src="../app-resources/home/common/img/icon_phone.png"></span>
                    <span><img src="../app-resources/home/common/img/icon_bpay.png"></span>
                    <span><img src="../app-resources/home/common/img/icon_auspost.png"></span>
                </div>
           </span>

           <span id="monthlyPaymentOption" class="monthlyPremium" hidden>
               <div>
                   <img id="payment-img" src="../app-resources/home/common/img/payment-icons-monthly.png">
               </div>
               <span class="yourBankAccount">Or your bank account</span>
           </span>
        </div>

        <br class="clear"/>

        <div id="print-quote-summary">
            <table class="quote-summary">
                <tbody>
                <tr class="first">
                    <td class="field-label">Type of cover:</td>
                    <td class="value">
                        Building & Contents
                    </td>
                </tr>
                <tr>
                    <td class="field-label">Insured address:</td>
                    <td class="value">
                        Level 1, 440 COLLINS ST, Melbourne VIC 3000
                    </td>
                </tr>

                <tr>
                    <td class="field-label">


                        Building sum insured:

                    </td>
                    <td class="value" id="printPropertySum">


                        $262,000


                    </td>
                </tr>


                <tr>
                    <td class="field-label">


                        Contents sum insured:

                    </td>
                    <td class="value" id="printContentsSum">
                        $3,000

                    </td>
                </tr>


                <tr>
                    <td class="field-label">


                        Your excesses:

                    </td>
                    <td class="value">

                        <div id="printBuildingExcess">


                            Building Flexi-Premium<sup>&#174;</sup> excess:


                            $<span class="excess">1000</span></div>


                        <div id="printContentsExcess">


                            Contents Flexi-Premium<sup>&#174;</sup> excess:


                            $<span class="excess">500</span>


                        </div>


                    </td>
                </tr>
                <tr>
                    <td class="field-label">Other excesses:</td>
                    <td class="value">
                        <div>Unoccupied Excess: $1,000</div>
                    </td>
                </tr>

                <tr>
                    <td class="field-label">Discounts applied:</td>
                    <td class="value">


                        $50 Online discount
                        <br/>


                        Up to 10&#37; Combined Building &amp; Contents discount


                    </td>
                </tr>

                </tbody>
            </table>
        </div>
    </div>
    <span class="text-style6">&copy;


        AAI Limited ABN 48 005 297 807 AFSL No. 230859 trading as AAMI

</span>
</div>


</div>
<script type="text/javascript">/* Start adding global members. */</script>
<script type="text/javascript">/* Finished adding global members. */</script>
<script type="text/javascript">/* Start adding members resolved by '/bundles/sg-home.js'. Bundle id is: '/bundles/sg-home.js' */</script>
<script type="text/javascript" src="/home/js/js/sg-page/module.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/page.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/address-details.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/common.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/confirmation.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/content-details.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/date.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/http.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/jeopardy.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/payment.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/personal-valuables.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/policyholder.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/portableContentDetails.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/quote-schedule.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/specific-contents.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/specific-personal-valuables.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/underwriting.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/branch/branch-quote-schedule.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/building-cover/building-cover.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/home-details/buildingTypes.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/home-details/home-details-aami.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/home-details/home-details-gio.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/home-details/home-details-suncorp.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/home-details/securityDetails.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/home-details/yearOfConstruction.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/insurance-options/insurance-options-aami.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/insurance-options/insurance-options-gio.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/insurance-options/insurance-options-suncorp.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/insurance-options/insurance-options.js"></script>
<script type="text/javascript" src="/home/js/js/sg-page/insurance-options/seniorsCardHolder.js"></script>
<script type="text/javascript">/* Finished adding members resolved by /bundles/sg-home.js */</script>
<script type="text/javascript">/* Site specific settings */
s.un = "sunaamidev"
s.siteID = "in:ami"
s.linkInternalFilters = "javascript:,suncorp.com.au"
s.trackingServer = "metrics.suncorp.com.au"
s.trackingServerSecure = "smetrics.suncorp.com.au"</script>
<script type="text/javascript">
    s.pageName = "in:ami:secapp:sales:home:quote:quote_retrieved:home_building_&_contents"
    s.events = "event10:QTE001216859HOM"
    s.products = ";home_building_&_contents"
    s.eVar31 = "262000.3000"
    s.eVar22 = "QTE001216859HOM"
    s.prop43 = "local"
    s.prop18 = "FREE_STANDING"
    s.eVar26 = "l96v0z1414043457458"
    s.prop16 = "NO"
    s.eVar72 = "W"
    s.prop17 = "2002"
    s.prop14 = "3000"
    s.eVar58 = "QuoteRetrievedByScreen"
    s.prop12 = "34"
    s.prop26 = "ANNUAL"
    s.eVar30 = "456.46"</script>
<script type="text/javascript">
    /* The Datalicious bottom d.b() function is defined in the datalicious.js
     file and triggers all web analytics server requests including the Omniture
     s.t function */
    if (typeof d != 'undefined') if (typeof d.b == 'function') d.b();
</script>

</body>
</html>

