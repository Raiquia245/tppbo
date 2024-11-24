
function switchTab(selectedTab, tabIndex) {
    const tabs = document.querySelectorAll('.tab-btn');
    const panels = document.querySelectorAll('.tab-panel');
    
    tabs.forEach(tab => tab.classList.remove('active'));
    panels.forEach(panel => panel.classList.remove('active'));
    
    selectedTab.classList.add('active');
    panels[tabIndex].classList.add('active');
}

function createBoxes() {
    const input = document.querySelector('.tab-panel.active input');
    const numBoxes = parseInt(input.value);
    const boxContainer = document.getElementById('boxContainer');
    
    boxContainer.innerHTML = '';
    
    for (let i = 0; i < numBoxes; i++) {
        const box = document.createElement('div');
        box.className = 'box';
        box.textContent = 'gambar';
        boxContainer.appendChild(box);
    }
}