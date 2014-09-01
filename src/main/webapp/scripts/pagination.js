$(document).ready(function () {
    var $pagination_content = $('.douban-collections');
    var item = '.douban-collection';
    var items_per_page = 6;
    var total_items = $pagination_content.find(item).size();
    var total_pages = Math.ceil(total_items / items_per_page);

    $('#current_page').val(0);
    $('#items_per_page').val(items_per_page);

    //setup the first page
    var navigation_html = '<a class="previous_link" href="javascript:previous();">Prev</a>';
    var current_link = 0;
    while (total_pages > current_link) {
        navigation_html += '<a class="page_link" href="javascript:go_to_page(' + current_link + ')" data-page-number="' + current_link + '">' + (current_link + 1) + '</a>';
        current_link++;
    }
    navigation_html += '<a class="next_link" href="javascript:next();">Next</a>';

    $('#page_navigation').html(navigation_html);
    $('#page_navigation .page_link:first').addClass('active_page');
    $pagination_content.find(item).hide();
    $pagination_content.find(item).slice(0, items_per_page).show();
});

function previous() {
    new_page = parseInt($('#current_page').val()) - 1;
    if ($('.active_page').prev('.page_link').length == true) {
        go_to_page(new_page);
    }
}

function next() {
    new_page = parseInt($('#current_page').val()) + 1;
    if ($('.active_page').next('.page_link').length == true) {
        go_to_page(new_page);
    }
}
function go_to_page(page_number) {
    var items_per_page = parseInt($('#items_per_page').val());
    start_from = page_number * items_per_page;
    end_on = start_from + items_per_page;
    $('.douban-collections').find('.douban-collection').hide().slice(start_from, end_on).show();
    $('.page_link[data-page-number=' + page_number + ']').addClass('active_page').siblings('.active_page').removeClass('active_page');
    $('#current_page').val(page_number);
}