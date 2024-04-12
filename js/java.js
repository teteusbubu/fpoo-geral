document.addEventListener('DOMContentLoaded', function() {
    const navbarCustomers = document.querySelector('.navbar-customers');
    const dropdownContainer = navbarCustomers.querySelector('.dropdown-container');
    
    navbarCustomers.addEventListener('click', function(event) {
        if (event.target.classList.contains('nav-link')) {
            dropdownContainer.style.display = dropdownContainer.style.display === 'block' ? 'none' : 'block';
        }
    });

    navbarCustomers.addEventListener('mouseleave', function(event) {
        dropdownContainer.style.display = 'none';
    });
});